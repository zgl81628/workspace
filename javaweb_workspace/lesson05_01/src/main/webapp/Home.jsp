<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="link.jsp"%>
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<%@ include file="navbar.jsp"%>
		<!-- END NAVBAR -->

		<!-- LEFT SIDEBAR -->
		<%@ include file="leftMenu.jsp"%>
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
								<div class="panel-heading">
									<h3 class="panel-title">Hover Row</h3>
								</div>
								<div class="panel-body">
									<table class="table table-hover">
										<thead>
											<tr>
												<th>编号</th>
												<th>First Name</th>
												<th>Last Name</th>
												<th>Username</th>
											</tr>
										</thead>
										<tbody>
                                            <c:forEach begin="1" end="10" step="1" varStatus="status">
											<tr>
												<td>${status.index}</td>
												<td>Steve</td>
												<td>Jobs</td>
												<td>@steve</td>
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
	<%@ include file="javascript.jsp"%>
</body>

</html>
