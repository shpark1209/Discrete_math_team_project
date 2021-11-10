package myPackage;

public interface GraphReader {
//	// 생성자
//	public Constructor(String fileName) {
//		// 주어진 txt 파일을 읽어내서 자료구조에 저장해야 합니다.
//	}
	
	// 생성자로 받은 파일에 저장된 그래프의 개수를 반환합니다.
	int GraphCount();
	
	// n번째 그래프 정보를 2차원 배열에 담아서 반환합니다. 
	int[][] getNextData(int n); 
	
	// 인접 행렬의 경우 2차원 배열, 하지만 다익스트라 문제의 경우는?? -> 추가 가능
	
	// 추가적인 메소드는 private으로 선언해 주세요
}
