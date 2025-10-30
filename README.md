# Java HashMap Practice: Word Counter and Word Grouper

This small Java console project demonstrate my learnings about `HashMap` from [Java Programming from MOOC.fi : HashMap](https://java-programming.mooc.fi/part-8/2-hash-map).
It combines two exercises into one cohesive program - a **word counter** and a **word grouper by length** to demonstrate both basic and intermediate `HashMap` applications.

---

## Features

### Word Counter

- Counts how many times each word appears.
- Stores results in a `HashMap<String, Integer>`.
- Displays how many times a word was entered by the user.

### Word Grouper

- Groups words entered based on their length.
- Uses a `HashMap<Integer, ArrayList<String>>` where:
  - Key > is the word length
  - Value > list of words with that length
- Displays all words grouped by their lengths.

---

## Project Structure

| File                            | Description                                                           |
| ------------------------------- | --------------------------------------------------------------------- |
| **`WordCounter.java`**          | Handles counting how many times each word appears.                    |
| **`WordsByLengthCounter.java`** | Manages grouping of words by their length using an ArrayList.         |
| **`UserInterface.java`**        | Provides a simple text-based interface for using the program.         |
| **`HashMapPractice.java`**      | The entry main (`main` method) that initializes and runs the program. |

---

## Concepts Practiced

- Using `HashMap` for key-value storage
- Storing `List` objects as values in a map
- OOP design
- Encapsulation and separation of concerns
- Basic console-based user interaction

## Example Usage

<pre><code>
Available commands: 
	[A] - To add word(s)
	[C] - To view count of a specific word
	[V] - To view counts of all words
	[L] - To view all words with the specified length
	[W] - To view all word lengths with their words
	[Q] - To quit the program
Enter your command: a
Enter your words: For God so loved the world He gave His only begotten Son
Available commands: 
	[A] - To add word(s)
	[C] - To view count of a specific word
	[V] - To view counts of all words
	[L] - To view all words with the specified length
	[W] - To view all word lengths with their words
	[Q] - To quit the program
Enter your command: v
the: 1
world: 1
his: 1
son: 1
loved: 1
for: 1
only: 1
gave: 1
begotten: 1
so: 1
god: 1
he: 1

Available commands: 
	[A] - To add word(s)
	[C] - To view count of a specific word
	[V] - To view counts of all words
	[L] - To view all words with the specified length
	[W] - To view all word lengths with their words
	[Q] - To quit the program
Enter your command: w
Word Length: [2]
	1: so
	2: he
Word Length: [3]
	1: for
	2: god
	3: the
	4: his
	5: son
Word Length: [4]
	1: gave
	2: only
Word Length: [5]
	1: loved
	2: world
Word Length: [8]
	1: begotten

Available commands: 
	[A] - To add word(s)
	[C] - To view count of a specific word
	[V] - To view counts of all words
	[L] - To view all words with the specified length
	[W] - To view all word lengths with their words
	[Q] - To quit the program
Enter your command: q
</code></pre>

---

## How to run

1. Clone this repository:

- git clone https://github.com/<your-username>/java-hashmap-practice.git

2. Navigate into the project folder:

- cd Java-HashMap-Practice-Word-Counter-and-Word-Grouper

3. Compile all files:

- javac \*.java

4. Run the program:

- java HashMapPractice

---

## Future Improvements

- Add file input/output (read words from a text file)
- Implement a simple graphical interface

---

## Author

- **Mark Danielle Bien**
- Beginner Java Developer practicing Object-Oriented Programming
- Currently studying via the [Java Programming MOOC](https://java-programming.mooc.fi/)