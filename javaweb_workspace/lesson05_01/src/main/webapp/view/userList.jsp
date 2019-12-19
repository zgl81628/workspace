<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="/link.jsp"%>
</head>
<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<%@ include file="/navbar.jsp"%>
		<!-- END NAVBAR -->

		<!-- LEFT SIDEBAR -->
		<%@ include file="/leftMenu.jsp"%>
		<!-- END LEFT SIDEBAR -->

		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- TABLE HOVER -->
							<div class="panel">
								<div class="panel-heading" style="padding-bottom: 0;">
									<ul class="breadcrumb">
										<li><a href="#">Home信息管理系统</a></li>
									    <li class="active">用户信息</li>
									</ul>
									<a href="#" class="btn btn-primary">添加</a>
									<a href="#" class="btn btn-primary">全选</a>
									<a href="#" class="btn btn-primary">全不选</a>
								</div>
								<div class="panel-body">
									<table class="table table-hover">
										<thead>
											<tr>
											    <th width="10%"><input type="checkbox" name="aaa"/>选择</th>
												<th width="10%">编号</th>
												<th width="20%">姓名</th>
												<th width="20%">年龄</th>
												<th width="10%">性别</th>
												<th width="30%">操作</th>
											</tr>
										</thead>
										<tbody>
                                            <c:forEach var="user" items="${users }" varStatus="status">
											<tr>
											    <td><input type="checkbox" name="bbb"/></td>
												<td>${user.id}</td>
												<td>${user.name}</td>
												<td>${user.age}</td>
												<td>${user.sex}</td>
												<td>
												 <a href="#" class="btn btn-primary">删除</a>
												 <a href="#" class="btn btn-primary">更新</a>
												</td>
											</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!-- END TABLE HOVER -->
						</div>
					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->

		<!-- END WRAPPER -->
	</div>
	<!-- Javascript -->
	<%@ include file="/javascript.jsp"%>
</body>

</html>
