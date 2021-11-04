package myPackage;

public interface GraphReader {
	// 주어진 txt 파일을 읽어냅니다.
	void readFile(String fileName);
	
	// 다음 그래프가 있는지 확인합니다.
	boolean hasNext();
	
	// 다음 그래프 정보를 2차원 배열에 담아서 반환합니다. 
	int[][] getNextData(); 
	
	// 인접 행렬의 경우 2차원 배열, 하지만 다익스트라 문제의 경우는?? -> 추가 가능
	int give();
}
