package com.jewel.poll.persistence.entity;

import com.jewel.poll.constant.EntityConstant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Set;

@Entity(name = EntityConstant.POLL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Getter
@Setter
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = EntityConstant.POLL_ID)
    private Long id;

    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = EntityConstant.POLL_ID)
    @OrderBy
    private Set<Option> options;
}
