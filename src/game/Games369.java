package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 미션: 3,6,9 게임
 * - 참가자는 숫자 혹은 3, 6, 9가 포함된 개수만큼 ‘박수’를 말한다.
 * - 예) 30, 65, 91 – ‘박수’33, 36, 69, 93 – ‘박수박수’
 * - 게임 참가자가 차례로 말해야 할 숫자 혹은 구호를 미리 예상하여 참가자가 틀린 답을 말한 경우 '틀렸습니다. ____를 말해야 합니다.’라고 출력한다.
 * 그리고, 게임은 종료된다.
 * - 참가자가 1부터 99까지 성공적으로 숫자 혹은 구호를 말했다면 ‘성공했습니다.’라고 출력한다. 그리고, 게임은 종료된다.
 * - 참가자가 제시해야할 숫자 혹은 구호에 해당되는 숫자가 7의 배수 일 때, “점프 숫자”를 외치고, 참가자는 숫자만큼 뒤의 숫자 혹은 구호를 제시한다.
 */
public class Games369 {
	public static void main(String[] args) throws IOException {
		System.out.println("start");
		int i = 0; // 심판자 숫자
		while (true) {
			i = i + 1; // 심판자 숫자 + 1
			if (i % 7 == 0) { // 7배수 인지 확인
				Random random = new Random();
				int randomNumber = random.nextInt(4) + 1; // 랜덤 숫자 생성 1 ~ 5
				System.out.println("점프 숫자는 " + randomNumber + " 입니다.");
				i = i + randomNumber;
				if (i > 99) {
					break; // while 반복문 빠져나감
				}
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String userNumber = br.readLine(); // 사용자 숫자 입력받기
			String message = ""; // 새로운 공간
			int ten = (i / 10); // 십의 자리
			int one = (i % 10); // 일의 자리
			if ((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
				message = "박수박수";
			} else if ((ten == 3 || ten == 6 || ten == 9) || (one == 3 || one == 6 || one == 9)) {
				message = "박수";
			} else {
				message = String.valueOf(i);
			}
			if (userNumber.equals(message)) {
				System.out.println("공백");
			} else {
				System.out.println("틀렸습니다. 심판자 기억 숫자는 : " + message + " 입니다.");
			}
			if (i >= 99) {
				break;
			}
		}
		System.out.println("end");
	}
}
