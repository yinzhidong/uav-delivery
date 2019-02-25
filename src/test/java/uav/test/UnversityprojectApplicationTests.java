package uav.test;

import org.junit.Test;

import com.echo.uav.*;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yinzhidong
 *
 */
public class UnversityprojectApplicationTests {

	/**
	 * @Description 测试派遣任务
	 *
	 */
	@Test
	public void createTaskUav() {
		Map<String, Object> param = new HashMap<>();
		param.put("TaskId", "11111");
		param.put("DroneName", "无人机1");
		param.put("DeliveryAddress", "上海");
		param.put("LongitudeLatitude", "123,111");
		param.put("CompletedTime", "150134432111");
		param.put("Version", 1);
		param.put("Action", "CreateTask");
		param.put("StartTime", new Date().getTime());
		new CreateTaskUav(param);
	}

	/**
	 * @Description 测试查询派遣无人机状态的方法
	 *
	 */
	@Test
	public void QueryTaskUav() {
		Map<String, Object> param = new HashMap<>();
		param.put("TaskId", "11111");
		param.put("DroneName", "无人机1");
		param.put("DeliveryAddress", "上海");
		param.put("LongitudeLatitude", "123,111");
		param.put("CompletedTime", "150134432111");
		param.put("Version", 1);
		param.put("Action", "QueryTask");
		param.put("StartTime", new Date().getTime());
		new QueryTaskUav(param);
	}

	/**
	 * @Description 测试键盘输入
	 *
	 */
	@Test
	public void commend() {
		Commend.commed();
	}

	/**
	 * @Description 测试httpclient中send方法
	 *
	 */
	@Test
	public void httpClientSend() throws IOException {
		String url = "";
		Map<String, Object> param = new HashMap<>();
		param.put("TaskId", "11111");
		param.put("DroneName", "无人机1");
		param.put("DeliveryAddress", "上海");
		param.put("LongitudeLatitude", "123,111");
		param.put("CompletedTime", "150134432111");
		param.put("Version", 1);
		param.put("Action", "QueryTask");
		param.put("StartTime", new Date().getTime());
		String encoding = "UTF-8";
		HttpConnect.send(url, param, encoding);
	}

	/**
	 * @Description 启动定时查询无人机状态
	 *
	 */
	@Test
	public void schedule() {
		Map<String, Object> param = new HashMap<>();
		param.put("TaskId", "11111");
		param.put("DroneName", "无人机1");
		param.put("DeliveryAddress", "上海");
		param.put("LongitudeLatitude", "123,111");
		param.put("CompletedTime", "150134432111");
		param.put("Version", 1);
		param.put("Action", "QueryTask");
		param.put("StartTime", new Date().getTime());
		Schedule.queryTaskUav(param);
	}
}
