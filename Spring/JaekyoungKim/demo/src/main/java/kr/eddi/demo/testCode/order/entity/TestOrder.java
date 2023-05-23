package kr.eddi.demo.testCode.order.entity;

import jakarta.persistence.*;
import kr.eddi.demo.testCode.account.entity.TestAccount;
import kr.eddi.demo.testCode.product.entity.TestProduct;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class TestOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @ManyToOne
    private TestAccount testAccount;
    @Getter
    @ManyToOne
    private TestProduct testProduct;

    public TestOrder(TestAccount testAccount, TestProduct testProduct) {
        this.testAccount = testAccount;
        this.testProduct = testProduct;
    }
}