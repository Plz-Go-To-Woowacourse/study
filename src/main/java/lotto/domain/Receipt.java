package lotto.domain;

import lotto.Exception.InvalidPriceException;
import lotto.constants.ErrorMessage;
import lotto.constants.LottoPrice;
import lotto.constants.OutputMessage;

public class Receipt {
    private final int purchaseAmount;

    public Receipt(int purchaseAmount) {
        validate(purchaseAmount);
        this.purchaseAmount = purchaseAmount;
    }

    private void validate(int purchaseAmount) {
        if (purchaseAmount % LottoPrice.PRICE_OF_LOTTO.getValue() != 0) {
            throw new InvalidPriceException(ErrorMessage.INVALID_LOTTO_PURCHASE_AMOUNT.getText());
        }
    }

    public int calcPurchaseCount() {
        return purchaseAmount / LottoPrice.PRICE_OF_LOTTO.getValue();
    }
}
