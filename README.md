# 📄 Fixed-Length TXT Generator

Este projeto Java cria arquivos `.txt` com registros de **tamanho fixo**, organizados a partir de dados de clientes. É útil para integração com sistemas legados, processamento em lote ou exportações formatadas.

---

## 📦 Estrutura do Projeto

    📁src/
     ├── Customer.java          // Classe que representa os dados do cliente
     ├── FixedFormatWriter.java // Classe utilitária para gerar arquivos de texto com campos fixos
     └── Main.java              // Classe principal que executa o projeto

---

## 🚀 Como Funciona

### 1. Modelo de Dados: `Customer.java`

Define a estrutura de um cliente com os seguintes campos:

| Campo        | Tipo     | Tamanho | Descrição                          |
|--------------|----------|---------|------------------------------------|
| `id`         | int      | 4       | Identificador numérico             |
| `name`       | String   | 20      | Nome do cliente                    |
| `balance`    | double   | 10      | Saldo do cliente com 2 casas decimais |

---

### 2. Escrita de Arquivo: `FixedFormatWriter.java`

Classe responsável por gerar arquivos `.txt` com **formato fixo**. Cada campo é preenchido e truncado/padronizado conforme necessário.

#### 🧩 Regras de Formatação

- `id`: alinhado à esquerda, 4 caracteres
- `name`: preenchido com espaços à direita até 20 caracteres
- `balance`: formatado como `0000000.00`, 10 caracteres

#### 🛠️ Método Principal

```java
public static void writeToFile(List<Customer> customers, String filePath)
```

Parâmetros:


- `customers:` Lista de objetos Customer

- `filePath:` Caminho de saída para o arquivo .txt

- `Saída:` Gera um arquivo de texto com registros de tamanho fixo


3. Execução: Main.java
Classe principal que instancia clientes, popula a lista e chama o writer.

```java
public class Main {
    public static void main(String[] args) {
        // Cria clientes
        // Gera o arquivo fixed.txt com os dados
    }
}
```

🧪 Exemplo de Saída

ID  |  NOME               |SALDO     |
|---|---------------------|----------|
0001   |Thiago Souza         |0000123.45|
0002   |Maria Oliveira       |0000678.90|
0003   |João Silva           |0000000.00|


