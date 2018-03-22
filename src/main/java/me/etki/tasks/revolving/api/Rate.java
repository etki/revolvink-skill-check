package me.etki.tasks.revolving.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Rate {
    @Getter
    @Setter
    private String source;
    @Getter
    @Setter
    private String target;
    @Getter
    @Setter
    private BigDecimal value;
    @Getter
    @Setter
    private ZonedDateTime createdAt;
    @Getter
    @Setter
    private ZonedDateTime updatedAt;
}
