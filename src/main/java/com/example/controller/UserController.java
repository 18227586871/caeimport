package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bean.UserBean;
import com.example.common.Common;
import com.example.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/demo")
    public List<UserBean> demo(String pageNo, String pageSize) {
        UserBean bean = new UserBean();
        bean.setPageNo(Integer.parseInt(pageNo));
        bean.setPageSize(Integer.parseInt(pageSize));

        List<UserBean> list = userService.getAllUser(bean);
        for (UserBean userBean : list) {
            System.out.println(("{" + userBean.getId() + "," + userBean.getName() + "," + userBean.getAge() + "}"));
            UserBean insert =new UserBean();
            insert.setName(userBean.getName());
            insert.setAge(userBean.getAge());
            insert.setShardValue(Common.DB_1);
            userService.insertUser(insert);
        }
        return list;
    }

    @RequestMapping("/demo2")
    public List<UserBean> demo2() {
        UserBean bean = new UserBean();
        bean.setPageNo(1);
        bean.setPageSize(1);
        bean.setShardValue(Common.DB_1);

        List<UserBean> list = userService.getAllUser(bean);
        return list;
    }



	/*@RequestMapping("/demo")
	public String demo(String pageNo,String pageSize,String name){
		UserBean bean = new UserBean();
		bean.setPageNo(Integer.parseInt(pageNo));
		bean.setPageSize(Integer.parseInt(pageSize));

		if(name != null){
			bean.setName(name);
		}
		List<UserBean> list = userService.getAllUser(bean);

		return list.size()+"===="+bean.getTotalNum();
	}
	@RequestMapping("/demo2")
	public String demo2(String pageNo,String pageSize,String name){
		UserBean bean = new UserBean();
		bean.setPageNo(Integer.parseInt(pageNo));
		bean.setPageSize(Integer.parseInt(pageSize));
		bean.setShardValue(Common.DB_1);
		if(name != null){
			bean.setName(name);
		}
		List<UserBean> list = userService.getAllUser(bean);
		
		return list.size()+"===="+bean.getTotalNum();
	}*/
}
