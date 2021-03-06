/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eryalus.emptybot.estados;

import com.eryalus.emptybot.data.Send;
import com.eryalus.emptybot.principal.BotTelegram;
import java.util.ArrayList;

/**
 *
 * @author eryalus
 */
public abstract class Estado {

    protected final BotTelegram PARENT;
    public static final int ESTADO_GENERAL = 0, ESTADO_GENERAL_ADMIN = 0;

    public Estado(BotTelegram bot) {
        PARENT = bot;
    }

    public abstract ArrayList<Send> response(ArrayList<Send> ms);
}
