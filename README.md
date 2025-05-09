# 🔍 Analizador de Código Java - Detección de Vulnerabilidades

## 📌 Explicación general del programa:

### 🎯 Propósito:
Este programa analiza un archivo `.java` buscando líneas con posibles vulnerabilidades, como contraseñas escritas directamente en el código fuente.

### 📥 Entrada:
La ruta al archivo se proporciona como argumento al ejecutar el programa desde la línea de comandos.

### ⚙️ Proceso:

1. Lee cada línea del archivo `.java`.
2. Revisa si contiene palabras peligrosas como:
    - `"password="`
    - `"1234"`
    - `"admin"`
3. Si detecta alguna coincidencia, imprime una advertencia indicando:
    - El número de línea.
    - El contenido sospechoso de la línea.

### 🛡️ Seguridad:
Este programa ayuda a prevenir **malas prácticas de programación** que podrían comprometer la seguridad del sistema o de la aplicación, promoviendo un análisis estático básico del código fuente.

---

## 🚀 Cómo usar:

Compila el archivo Java:
```bash
   javac AnalizadorCodigo.java
```

## ✅ Características modernas utilizadas

- 📂 `java.nio.file.Files.readAllLines()` para leer archivos de forma simple y eficiente.
- 🔁 `IntStream.range()` para recorrer líneas con su índice.
- ⚡ Expresiones lambda para filtrar y procesar las líneas en una sola instrucción funcional.
- 💡 Código más conciso, legible y alineado con las buenas prácticas de Java moderno (Java 8+).

