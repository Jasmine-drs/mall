package servlet;

import bean.Commodity;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 商品类的业务操作
 * @author Jasmine-drs
 * @date 2023/5/20 9:52
 */

@WebServlet(urlPatterns = {"/category/findById","/category/all","/admin/category/updateById"}, name = "category")
public class CommodityServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.endsWith("findById")) {
            System.out.println("CommodityServlet.service");
            findById(req, resp);
        } else if (uri.endsWith("all")) {
            System.out.println("CommodityServlet.service");
            allById(req, resp);
        } else if (uri.endsWith("updateById")) {
            System.out.println("CommodityServlet.service");
            updateById(req, resp);
        }
    }

    /**
     * 根据商品id，修改商品信息
     * @param req   请求
     * @param resp  响应
     */
    private void updateById(HttpServletRequest req, HttpServletResponse resp) {

    }

    /**
     * 根据商品种类id，查询所有商品信息
     * @param req   请求
     * @param resp  响应
     */
    private void allById(HttpServletRequest req, HttpServletResponse resp) {
        Integer id = Integer.valueOf(req.getParameter("categoryId"));
        System.out.println("id = " + id);
        String sql = "select * from commodity where category_id = ? and status=1";
        List<Map<String, Object>> query = DBUtil.query(sql, id);
//        System.out.println("query = " + query);
        List<Commodity> commodityList =new ArrayList<>();

        if (query != null) {
            for (Map<String, Object> t : query) {
                Commodity commodity = new Commodity();
//                封装数据
                commodity.setId((Integer) t.get("id"));
                commodity.setName((String) t.get("name"));
                commodity.setPrice((Float) t.get("price"));
                commodity.setBrand(t.get("brand").toString());
                commodity.setNumber((Integer) t.get("number"));
                commodity.setCategoryId((Integer) t.get("category_id"));
                commodity.setDiscount((Float) t.get("discount"));
                commodity.setStatus(1);
                commodity.setImageUrl((String) t.get("image_url"));
                commodity.setIllustrate((String) t.get("illustrate"));
                commodity.setCreateTime((LocalDateTime) t.get("create_time"));
                commodity.setUpdateTime((LocalDateTime) t.get("update_time"));
                System.out.println("commodity = " + commodity);
//                添加到集合中
                commodityList.add(commodity);
            }
        }
        req.setAttribute("commodityList", commodityList);
//        转发到商品列表页面
        try {
            req.getRequestDispatcher("/client/category.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据商品id，查询商品信息
     * @param req   请求
     * @param resp  响应
     */
    private void findById(HttpServletRequest req, HttpServletResponse resp) {

    }
}
