/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author CicloM
 */
public final class App {

    //Datos
    public static final int N1;
    public static final int N2;

    static {
        //Random
        final Random RND = new Random();

        //Constantes
        final int NUM_MAX = 10;
        final int NUM_MIN = 1;
        // Valores > constantes
        N1 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
        N2 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
    }

    public final void launchApp() {

        System.out.printf("OPERACIÓN NUMÉRICA %n==================%n "
                + "Número 1 ....: %d%n Número 2 ....: %d%n---%n"
                + " El MAYOR es .: %d%n", N1, N2, 
                (int) UtilesPrimitivos.operar(N1, N2, UtilesPrimitivos.OP_MAY));

    }


}
