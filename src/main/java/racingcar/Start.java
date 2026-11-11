package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Start {

    public void start(LinkedHashMap<String, Integer> carList, int count) {
        System.out.println("실행 결과");
        for (int i = 0; i < count; i++) {
            for (Map.Entry<String, Integer> car : carList.entrySet()) {
                System.out.print(car.getKey() + " : ");
                car.setValue(moveOrNot(car.getValue()));    // value를 moveOrNot 메서드로 빼서 조건에 맞춰 전진값을 value로
                System.out.print("-".repeat(car.getValue()));
                System.out.println();
            }
            System.out.println();
        }
        Champion champion = new Champion();
        champion.champion(carList);
    }

    public static int moveOrNot(Integer value) {
        if (Randoms.pickNumberInRange(0,9) >= 4) {
            value += 1;
        }
        return value;
    }
}
