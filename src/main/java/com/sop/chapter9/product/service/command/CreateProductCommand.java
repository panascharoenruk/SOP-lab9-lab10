package com.sop.chapter9.product.service.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;
import lombok.Builder;
import lombok.Data;

import java.lang.annotation.Target;
import java.math.BigDecimal;

@Builder
@Data
public class CreateProductCommand {

    @TargetAggregateIdentifier
    private final String productId;
    private final String title;
    private final BigDecimal price;
    private final Integer quantity;

}
