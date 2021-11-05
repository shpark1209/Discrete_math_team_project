package myPackage;

public interface GraphInterpreter {
	// 그래프를 해석하는 함수입니다.
	void interpretGraph();
	
	// 해석한 그래프 내용을 출력 예제를 통해서 출력해주면 됩니다.
	@Override
	String toString();
	
	// 나머지는 private 메소드로 자유롭게 구현
}
