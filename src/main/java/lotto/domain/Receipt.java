package lotto.domain;

import lotto.Exception.InvalidPriceException;
import lotto.constants.ErrorMessage;
import lotto.constants.LottoPrice;
import lotto.constants.OutputMessage;

public class Receipt {
    private final int purchaseAmount;
    private int purchaseCount;

    public Receipt(int purchaseAmount) {
        validate(purchaseAmount);
        this.purchaseAmount = purchaseAmount;
        purchaseCount = purchaseAmount / LottoPrice.PRICE_OF_LOTTO.getValue();
    }

    private void validate(int purchaseAmount) {
        if (purchaseAmount % LottoPrice.PRICE_OF_LOTTO.getValue() != 0) {
            throw new InvalidPriceException(ErrorMessage.INVALID_LOTTO_PURCHASE_AMOUNT.getText());
        }
    }

    @Override
    public String toString() {
        return String.format(OutputMessage.LOTTO_PURCHASE_COUNT.getText(), purchaseCount);
    }
}
