package com.rms.model;

public enum Role{

    TRNG_MNGR(1), BLDG_MNGR(2), TRAINER(3), LOCKED(4);

    private final int role;

    private Role(int role){this.role = role;}

    public int getValue(){
        return role;
    }
}