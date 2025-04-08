package ex01_Thread;

// 데몬스레드
// 메인 작업을 돕는 역할을 하는 스레드
// 메인 작업을 하는 스레드가 종료되면 같이 종료
public class DaemonMain {
	public static void main(String[] args) {
		// 데몬스레드의 생성
		Thread daemonThread = new Thread(new MyDaemonRunnable());
		
		// 데몬 스레드로 설정한다.
		daemonThread.setDaemon(true);
		
		
		
		
		
	}
}


class MyDaemonRunnable implements Runnable{
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 15; i++) {
				System.out.println("저장되었습니다.");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}