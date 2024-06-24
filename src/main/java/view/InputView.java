package view;

import domain.lotto.LottoResult;
import domain.lotto.Money;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    
    public static Money inputMoney() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");
        return new Money(scanner.nextInt());
    }

    public static LottoResult inputWinningNumbers() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
        return new LottoResult(list);
    }
}
