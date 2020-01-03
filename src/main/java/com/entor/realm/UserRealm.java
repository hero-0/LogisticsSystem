package com.entor.realm;

import java.util.Collection;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

public class UserRealm extends AuthorizingRealm {
	
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
		/*// 这里做权限控制
		//获取用户名
		String username = principals.getPrimaryPrincipal().toString();
		//获取所有角色名称
		List<String> authList = authService.queryAuthByUsername(username);
		//获取所有的权限名称
		List<String> roleList = roleService.queryRoleByUsername(username);
		//创建权限对象
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//添加角色
		info.addRoles(roleList);
		//添加权限
		info.addStringPermissions(authList);
		return info;*/
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		return null;
		/*String username = token.getPrincipal().toString();
		String password = new String((char[])token.getCredentials());
		QueryWrapper<User> qw = new QueryWrapper<User>();
		qw.eq("username", username);
		qw.eq("password", password);
		User user = userService.getOne(qw);
		if(user==null) {
			throw new AuthenticationException("用户名或密码错误");
		}
		Collection<Session> list = sessionDao.getActiveSessions();
		for(Session s:list) {
			String username2 = String.valueOf(s.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY));
			if(username.equals(username2)) {
				//设置会话超时，解决登录后再进行登录问题，0代表失效
				s.setTimeout(0);
				break;
			}
		}
		list = sessionDao.getActiveSessions();
		System.out.println("登录人数："+list.size());
		return new SimpleAuthenticationInfo(username,password,"0");*/
	}
}