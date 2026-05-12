# Mini Diccionario Español → Inglés

Actividad de lógica de programación en Java. El programa selecciona 5 palabras al azar de un banco de 20 palabras en español y le pide al usuario que las traduzca al inglés.

---

## ¿Cómo funciona?

1. Se declara un `HashMap` con 20 pares de palabras español/inglés.
2. Las claves se cargan en un `ArrayList`, se mezclan aleatoriamente con `Collections.shuffle()` y se toman las primeras 5 con `subList()`.
3. El programa le pregunta al usuario la traducción de cada palabra una por una.
4. Al final muestra el puntaje obtenido.
5. Si el usuario acierta las 5, se desbloquea un mensaje secreto!!

---

## Conceptos aplicados

| Concepto | Uso en el proyecto |
|---|---|
| `HashMap<String, String>` | Almacenar los pares español/inglés |
| `ArrayList` | Guardar y manipular las palabras |
| `Collections.shuffle()` | Mezclar las palabras al azar |
| `subList(0, 5)` | Seleccionar solo 5 palabras del banco |
| `Scanner` | Leer la respuesta del usuario |
| `for each` | Iterar sobre las palabras seleccionadas |
| `.trim().toLowerCase()` | Normalizar la respuesta del usuario |
| `if / else` | Verificar si la respuesta es correcta |

---

## Ejemplo de ejecución

```
=== Hola! Bienvenidx/Welcome a mi mini diccionario Español -> Inglés ===
Tendras 5 palabras en español. Traducelas correctamente para ver el mensaje secreto OwO

Como se traduce al inglés 'lagarto'? ->
lizard
Correcto!

Como se traduce al inglés 'paraguas'? ->
rain
Incorrecto :( La respuesta era: 'umbrella'

...

== Resultado final ==
Correctas:   4
Incorrectas: 1
Puntaje: 4 / 5
```

---

## Banco de palabras

El diccionario contiene 20 palabras:
`manzana`, `perro`, `silla`, `paraguas`, `espejo`, `teclado`, `madera`, `azucar`, `lunes`, `lagarto`, `gato`, `ciudad`, `hielo`, `ventana`, `calabaza`, `sombra`, `lapiz`, `arcoiris`, `trueno`, `playa`, `flor`
