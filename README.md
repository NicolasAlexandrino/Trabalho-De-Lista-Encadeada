# Trabalho-De-Lista-Encadeada

# 🧠 Estruturas de Dados em Java — Listas Encadeadas  
Trabalho de Composição da 2ª Nota – Estrutura de Dados  
Centro Universitário Santo Agostinho  

---

## 🎯 Objetivo
Implementar **estruturas de listas encadeadas em Java** sem o uso de coleções prontas, consolidando o entendimento de manipulação dinâmica de dados com nós e ponteiros.  

As três listas implementadas são:
1. **Lista Encadeada Simples**
2. **Lista Duplamente Encadeada**
3. **Lista Encadeada Circular**

---

## 💻 Ambiente de Desenvolvimento
- **Linguagem:** Java  
- **IDE utilizada:** Eclipse  
- **Bibliotecas externas:** Nenhuma — toda a estrutura foi implementada manualmente.  

---

## 🧩 Estruturas Implementadas

### 🟩 1. Lista Encadeada Simples
**Descrição:**  
É uma lista linear em que cada nó armazena um valor e uma referência (`next`) para o próximo nó.  
O último nó aponta para `null`, indicando o fim da lista.

**Características:**
- Permite percorrer apenas no sentido **direto (head → fim)**.  
- Cada nó possui **um ponteiro (`next`)**.  
- Estrutura leve e fácil de implementar.  

**Operações principais:**
- Inserção no início, meio e fim.  
- Remoção de elemento.  
- Busca de valor.  
- Listagem completa dos elementos.

---

### 🟨 2. Lista Duplamente Encadeada
**Descrição:**  
Cada nó possui duas referências: uma para o próximo (`next`) e outra para o anterior (`prev`).  
Isso permite a **navegação em ambos os sentidos**.

**Características:**
- Estrutura bidirecional (`anterior ↔ atual ↔ próximo`).  
- Inserção e remoção mais eficientes (não precisa percorrer tudo).  
- Mais memória usada (dois ponteiros por nó).  

**Operações principais:**
- Inserção no início, meio e fim.  
- Remoção de elemento.  
- Listagem normal e reversa.  


---

### 🟦 3. Lista Encadeada Circular
**Descrição:**  
O último nó não aponta para `null`, mas para o **primeiro nó**, formando um **ciclo fechado**.  
Isso permite percorrer a lista de forma contínua, sem precisar recomeçar manualmente.

**Características:**
- Estrutura cíclica (sem começo nem fim fixo).  
- Normalmente controlada por um ponteiro `tail` (último nó).  
- Útil em sistemas que precisam “recomeçar” o percurso (ex: playlists, filas circulares, jogos).  

**Operações principais:**
- Inserção no início, meio e fim.  
- Remoção e busca de elementos.  
- Listagem com controle de loop.  


Cada classe de lista contém um método `main()` interno para **testes automáticos**, ou seja, é possível **executar qualquer uma delas diretamente no Eclipse** e visualizar o funcionamento.

---

## ▶️ Como Executar no Eclipse

1. **Abra o Eclipse**  
2. Crie um novo **Java Project** chamado `EstruturasDeDados`  
3. Dentro da pasta `src`, crie três pacotes:
   - `ListaSimples`
   - `ListaDupla`
   - `ListaCircular`
4. Copie os arquivos `.java` correspondentes para cada pacote.  
5. Clique com o botão direito em uma das classes (`ListaSimples.java`, `ListaDupla.java` ou `ListaCircular.java`) e selecione **Run As → Java Application**.  

---

## 📺 Demonstração em Vídeo

🎥 **Link do vídeo explicativo (Google Drive):**  
👉 [Clique aqui para assistir](https://drive.google.com/file/d/1OJwQ80tgqdzmXrnStH4QwM0BbKuzz7Jf/view?usp=sharing)

> No vídeo demonstro a execução das três listas no Eclipse, explicando:
> - Como ocorre a inserção e remoção dos nós;
> - Como cada tipo de lista se diferencia;
> - E o comportamento circular da última estrutura.

---

## 🧾 Diferenças Principais Entre as Três Estruturas

| Tipo | Direção de Percurso | Último Nó | Ponteiros por Nó | Uso Típico |
|------|----------------------|------------|------------------|-------------|
| **Simples** | Só para frente | `null` | 1 (`next`) | Estruturas básicas |
| **Dupla** | Frente e trás | `null` | 2 (`next`, `prev`) | Navegação bidirecional |
| **Circular** | Contínua (volta ao início) | Aponta para o primeiro | 1 (`next`) | Estruturas cíclicas (playlists, filas) |

---

## 📚 Observações
- Nenhuma estrutura utiliza `ArrayList`, `LinkedList` ou qualquer coleção da API Java.  
- Todo o controle de memória e encadeamento foi feito **manualmente**, utilizando **referências de nós**.  
- O código está **comentado, limpo e orientado a objetos**, conforme as boas práticas.  

---

## 🧑‍💻 Autor
**Nome:** _[Nicolas Alexandrino Da Silva Amorim]_  
**Curso:** Engenharia de Software  
**Disciplina:** Estrutura de Dados  
**Professor:** _[Anderson Soares Costa]_  
**Data de entrega:** 25/10/2025  
