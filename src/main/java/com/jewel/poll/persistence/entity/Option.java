package com.jewel.poll.persistence.entity;

import com.jewel.poll.constant.EntityConstant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity(name = EntityConstant.OPTION)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Option {
    @Id
    @GeneratedValue
    @Column(name = EntityConstant.OPTION_ID)
    private Long id;

    @Column(name = EntityConstant.OPTION_NAME)
    private String value;
}
