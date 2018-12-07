package cosaM1.impl;

import enums.Action;
import cosaM1.interfaces.State;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConfigurationState implements State {
    private Action action;
    private String payload;
}
