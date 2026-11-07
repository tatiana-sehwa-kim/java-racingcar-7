package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.LinkedHashMap;
import java.util.Map;

public class Race {

    private LinkedHashMap<String, Integer> carList;
    private Integer count;

    public void race(String list, String number) { // String을 리스트, 횟수로 change
        String[] arr = list.split(",");
        for (String item : arr) {
            carList.put(item.trim(), null); // 앞뒤 공백 제거 후 map의 key, null 추가 // 예외처리 추가 요망
        }
        count = Integer.parseInt(number);  // 예외처리 추가 요망
        start();
    }

    public void start() {   // 레이스 출력: 반복문
        System.out.println("실행 결과");
        for (int i = 0; i < count; i++) {
            for (Map.Entry<String, Integer> car : carList.entrySet()) {
                System.out.print(car.getKey() + " : ");
                if (Randoms.pickNumberInRange(0,9) >= 4) {
                    Integer now = car.getValue();
                    carList.put(car.getKey(), now + 1);
                }
                System.out.print("-".repeat(car.getValue()));
                System.out.println();
            }
        }
        champion();
    }

    private void champion() {   // 값을 비교해서 우승자(키)를 프린트

    }
}
