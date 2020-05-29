package com.revature.collections3;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList is better for searching 
		// Linked Lists is better for adding and removing elements from a list
		
		/*
		 *   HashSets & LinkedSets  --> implement the Set Interface
		 *   -- Sets differ from Lists in they do not allow duplicates 
		 *   -- (lists DO allow duplicate values)
		 *   -- a HashSet stores objects using a hashtable for storage  		
		 */
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(2);
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		Animal a1 = new Animal("Dog", 7);
		Animal a2 = new Animal("Cat", 12);
		Animal a3 = new Animal("Platypus", 2);
		Animal a4 = new Animal("Dog", 7);
		
		
		HashSet<Animal> set = new HashSet<Animal>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		
		for (Animal an : set) {
			System.out.println(an);
		}
		
	}

}
