package com.app.dto;

public class EmployeeRequest
{
		private String ename;
		private String password;
		private String dept;
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String role) {
			this.dept = role;
		}
		@Override
		public String toString() {
			return "UserRequest [ename=" + ename + ", password=" + password + ", dept=" + dept + "]";
		}
		public EmployeeRequest(String ename, String password, String dept) {
			super();
			this.ename = ename;
			this.password = password;
			this.dept = dept;
		}
		public EmployeeRequest() {
			super();
			
		}

}
