package com.jewel.poll.persistence.entity;

import com.jewel.poll.constant.EntityConstant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Setter
@Getter
@Entity(name = EntityConstant.VOTE)
public class Vote {

    @Id
    @GeneratedValue
    @Column(name = EntityConstant.VOTE_ID)
    private Long id;

    @ManyToOne
    @JoinColumn(name = EntityConstant.OPTION_ID)
    private Option option;
}
