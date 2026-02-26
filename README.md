# 🎮 Hangman Game

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" alt="Java"/>
  <img src="https://img.shields.io/badge/Type-Console%20Game-blue?style=for-the-badge" alt="Console Game"/>
  <img src="https://img.shields.io/badge/License-MIT-green?style=for-the-badge" alt="MIT License"/>
</p>

A classic **Hangman** word-guessing game built in Java and played right in your terminal. 🖥️  
Guess the hidden word one letter at a time — but beware, you only get **6 chances** before the hangman is complete! ☠️

---

## 📖 Table of Contents

- [✨ Features](#-features)
- [🗂️ Project Structure](#️-project-structure)
- [📐 UML Diagram](#-uml-diagram)
- [⚙️ Prerequisites](#️-prerequisites)
- [🚀 Getting Started](#-getting-started)
- [🕹️ How to Play](#️-how-to-play)
- [📝 Word Categories](#-word-categories)
- [📜 License](#-license)

---

## ✨ Features

- 🎯 **Random Word Selection** — A word is randomly chosen from a diverse built-in word bank each round.
- 🔤 **Letter-by-letter Guessing** — Reveal the hidden word one character at a time.
- 💀 **ASCII Hangman Art** — Watch the hangman drawing build step-by-step as wrong guesses pile up (6 stages).
- 🔁 **Replay Support** — After each round, return to the main menu and start a new game without restarting the program.
- 🚫 **Duplicate Guess Detection** — The game warns you if you've already guessed a letter.
- 🏆 **Win/Loss Feedback** — Clear result messages at the end of every round.

---

## 🗂️ Project Structure

```
Hangman-Game/
│
├── Main.java           # 🚪 Entry point — launches the game
├── GameController.java # 🎮 Controls the main menu and game loop
├── GameSession.java    # 🔄 Manages a single round of play
├── WordBank.java       # 📚 Supplies a pool of random words
├── HangmanArt.java     # 🎨 Renders ASCII art (welcome banner + hangman stages)
├── Hangman UML.svg     # 📐 UML class diagram
└── README.md           # 📄 Project documentation
```

---

## 📐 UML Diagram

> The class diagram below illustrates the relationships between the core game components.

![UML Diagram](Hangman%20UML.svg)

---

## ⚙️ Prerequisites

| Requirement | Version  |
|-------------|----------|
| ☕ Java JDK  | 17 or higher (uses text blocks) |

> Verify your Java installation:
> ```bash
> java -version
> ```

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/AbdallahAhmed149/Hangman-Game.git
cd Hangman-Game
```

### 2️⃣ Compile the Source Files

```bash
javac *.java
```

### 3️⃣ Run the Game

```bash
java Main
```

---

## 🕹️ How to Play

1. **Enter your name** when prompted — a personalized welcome banner will greet you. 👋
2. From the **main menu**, choose:
   - `1` ▶️ Start a new game
   - `2` 🚪 Exit
3. A secret word will be selected and displayed as a row of underscores (e.g. `_ _ _ _ _`).
4. **Guess a letter** by typing it and pressing Enter.
   - ✅ Correct guess → the letter is revealed in its position(s).
   - ❌ Wrong guess → one life is lost and the hangman drawing progresses.
5. You have **6 incorrect guesses** before the game is over.
6. Win by revealing the full word before the hangman is complete! 🎉

### 🖼️ Hangman Stages

```
  +---+     +---+     +---+     +---+     +---+     +---+     +---+
  |   |     |   |     |   |     |   |     |   |     |   |     |   |
      |     O   |     O   |     O   |     O   |     O   |     O   |
      |         |     |   |    /|   |    /|\  |    /|\  |    /|\  |
      |         |         |         |         |    /    |    / \  |
      |         |         |         |         |         |         |
=========  =========  =========  =========  =========  =========  =========
 6 left     5 left     4 left     3 left     2 left     1 left     0 left
```

---

## 📝 Word Categories

The built-in word bank spans several topics to keep every round interesting:

| Category        | Example Words                              |
|-----------------|--------------------------------------------|
| 🌍 General       | `layer`, `orange`, `play`, `umbrella`      |
| 🏔️ Nature        | `mountain`, `gravity`, `galaxy`            |
| 💻 Technology    | `algorithm`, `database`, `compiler`, `network` |
| 🚀 Science       | `telescope`, `electron`, `velocity`, `quantum` |
| 💼 Business      | `strategy`, `marketing`, `revenue`, `startup`, `finance` |
| 📦 Everyday      | `adventure`, `bookshelf`, `guitar`, `delivery` |

---

## 📜 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<p align="center">Made with ❤️ by <a href="https://github.com/AbdallahAhmed149">AbdallahAhmed149</a></p>
