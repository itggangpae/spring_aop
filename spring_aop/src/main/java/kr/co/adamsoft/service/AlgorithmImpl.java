package kr.co.adamsoft.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AlgorithmImpl implements Algorithm {
	private List<Integer> arrayList;
	private List<Integer> linkedList;
	
	public AlgorithmImpl() {
		arrayList = new ArrayList<Integer>();
		linkedList = new LinkedList<Integer>();
	}
	
	public void arrayListInsert() {
		for(int i = 0; i<100000; i=i+1) {
			arrayList.add(0, i);
		}
	}
	
	public void linkedListInsert() {
		for(int i = 0; i<100000; i=i+1) {
			linkedList.add(0, i);
		}
	}
	
	public void arrayListRead() {
		for(int i=0; i<arrayList.size(); i=i+1) {
			System.out.println(arrayList.get(i));
		}
	}
	
	public void linkedListRead() {
		for(int i=0; i<linkedList.size(); i=i+1) {
			System.out.println(linkedList.get(i));
		}
	}
}

	
