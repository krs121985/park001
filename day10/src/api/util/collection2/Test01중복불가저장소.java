package api.util.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public interface Test01중복불가저장소 {
	public static void main(String[] args) {
		//Set
		//저장 방식이 이미 정해져있는 저장소
		//트리(Tree) 방식 또는 해시(Hash0방식 등이 존재
		//데이터 유무를 빠르게 확인하는 ?
		
		//생성
		Set<String> a = new TreeSet<>();
		Set<String> b = new HashSet<>();
		
		//추가 - add(List와 동일)
		a.add("피카츄"); b.add("피카츄");
		a.add("라이츄"); b.add("라이츄");
		a.add("파이리"); b.add("파이리");
		a.add("꼬부기"); b.add("꼬부기");
		a.add("버터플"); b.add("버터플"); //데이터 추가(true 반환)
		
		a.add("파이리"); b.add("파이리"); //중복 데이터는 들어가지 않음(false 반환)
		
		//검색 - contains(List와 동일)
		System.out.println("피카츄 있어요? " + a.contains("피카츄"));
		
		//삭제 - remove(List와 동일) remove(e) or remove(index)
		a.remove("파이리"); //지워지면 true, 안지워지면 false
		
		//개수확인 - size(List와 동일)
		System.out.println("a의 데이터 수 = " + a.size());
		System.out.println("b의 데이터 수 = " + b.size());
		
		//출력 - x (List에는 get(index)라는게 있음 
		System.out.println("a = " +  a);
		System.out.println("b = " +  b);
		
		//주의 Set은 순서가 없으며 이로인해 딱 하나의 데이터만 꺼낼 수 없다.(다 꺼내야함)
		for(String name : a) {
			System.out.println("이름 = " + name);			
		}
		//중복이 안들어가며, 한개를 꺼내는게 없는게, List와의 차이
		//List<E> = 전체조회 + 개별관리 - 수강생이 1대1로 강사님에게 메신저 혹은 dm보내는거 즉 강사님은 수강생의 이름을 알야야됨
		//Set<E> = 전체조회 - 강사님과 수강생들의 강의
		//Map<K,V> = 개별관리
	}
}
