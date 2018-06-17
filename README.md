# Programa-generador

## Descripción
Este repositorio contiene el programa Java utilizado durante el proyecto para generar programas con sus respectivos tests,
donde el usuario puede introducir parámetros que determinaran la estructura del programa generado.

El objetivo es realizar experimentos para detectar qué características de los programas tienen un mayor impacto en la CT (Complejidad de Testing) al aplicar pruebas. Concretamente, se trata de identificar cómo varía la CT cuando aplicamos las pruebas sobre programas con distintas estructuras (e.g. variación en el número de condiciones de bifurcación, nivel de anidamiento, iteración en los bucles, etc.) y diferentes errores producidos en ellas.

## Parámetros del programa
**anidaciónIf**: número entero que indica el nivel de anidación en una condición if. Para un valor de 1, obtenemos un solo if. Para un valor 2, obtenemos dos if, uno dentro de otro. Y así para cualquier n.

**anidacionFor**: análogo al anterior, pero con bucles for.

**anidacionWhile**: análogo al anterior, pero con bucles while.

**sizeFor**: determina el número de iteraciones que realiza un bucle for.

**sizeWhile**: análogo al anterior, pero con bucles while.

**size_expLogics**: especifica el número de operadores lógicos en una expresión lógica.

**size_expArit**: especifica el número de operadores aritméticos en una expresión aritmética.

**size_cond**: especifica el número de operadores lógicos que aparecen en las condiciones de las expresiones while e if.

**num_function**: especifica el número de funciones que se va a generar.

**decisión_inputs**: es una lista de números enteros. Cada uno de ellos indica el método concreto del programa que se va a ejecutar (en base al parámetro anteriormente visto).

**ini**: especifica el inicio de la comprobación entre el resultado de un programa original y el resultado de los mutantes (porque el resultado es almacenado como una lista de elementos).

**fin**: análogo al anterior, pero para el final de la comprobación.

**ifsAniCuerpoBucle**: indica la anidación de if que habrá dentro de los cuerpos de los bucles.

**num_exp_seguida**: establece una serie de expresiones consecutivas. Todas ellas son asignaciones a variables (simples o en las que haya que realizar alguna operación matemática, como por ejemplo multiplicar dos números).

**num_tests**: indica el número de tests que se generan. Los tests generados tienen un número asociado y, a medida que se incrementa el valor asociado, la cobertura de código aumenta.

**aleatorio**: indica si se desea que la estructura (e.d. los parámetros) se establezcan de forma aleatoria.
