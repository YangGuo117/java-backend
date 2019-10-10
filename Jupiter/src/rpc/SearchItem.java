package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import entity.Item;
import external.TicketMasterClient;

/**
 * Servlet implementation class SearchItem
 */
@WebServlet("/search")
public class SearchItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
		
		double lat = Double.parseDouble(request.getParameter("lat"));
		double lon = Double.parseDouble(request.getParameter("lon"));
		TicketMasterClient client = new TicketMasterClient();
		JSONArray array = new JSONArray();
		for (Item it:client.search(lat, lon, null)) {
			array.put(it.toJSONObject().toString() );
		}
		
		RpcHelper.writeJsonArray(response,array );
//		JSONObject obj = new JSONObject();
//		if (request.getParameter("username") != null) {
//			String username = request.getParameter("username");
//			try {
//				obj.put("username", username);
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			RpcHelper.writeJsonObject(response, obj);
//		}
//		
//		
//		
//		JSONArray array = new JSONArray();
//		try {
//			array.put(new JSONObject().put("username", "abcd").put("address", "san francisco").put("time","01/01/2017"));
//			array.put(new JSONObject().put("username", "1234").put("address", "san jose").put("time","01/02/2017"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		RpcHelper.writeJsonArray(response, array);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
		PrintWriter writer = response.getWriter();
		
//		doGet(request, response);
	}

}
