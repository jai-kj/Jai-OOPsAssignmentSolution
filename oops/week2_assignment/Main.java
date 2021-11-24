package com.greatlearning.oops.week2_assignment;

public class Main {
	public static void main(String[] args) {
		HRDepartment hrDeptObj = new HRDepartment();
		TechDepartment techDeptObj = new TechDepartment();
		AdminDepartment adminDeptObj = new AdminDepartment();
		
		System.out.println("Welcome to " + adminDeptObj.departmentName());
		System.out.println(adminDeptObj.getTodaysWork());
		System.out.println(adminDeptObj.getWorkDeadline());
		System.out.println(adminDeptObj.isTodayAHoliday());

		System.out.println("\nWelcome to " + hrDeptObj.departmentName());
		System.out.println(hrDeptObj.doActivity());
		System.out.println(hrDeptObj.getTodaysWork());
		System.out.println(hrDeptObj.getWorkDeadline());
		System.out.println(hrDeptObj.isTodayAHoliday());

		System.out.println("\nWelcome to " + techDeptObj.departmentName());
		System.out.println(techDeptObj.getTodaysWork());
		System.out.println(techDeptObj.getWorkDeadline());
		System.out.println(techDeptObj.getTechStackInformation());
		System.out.println(techDeptObj.isTodayAHoliday());
	}
}
