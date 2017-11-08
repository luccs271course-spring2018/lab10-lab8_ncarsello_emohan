<h1> Try using a TreeMap instead of a HashMap. Does this make any difference?</h1>
A tree map would make it easier to sort as Hash maps don't sort on their own. It would be faster as it is O(log(n)) instead of O(1).

<h1> What happens if you invoke countWords multiple times for different String iterators?</h1>
If you invoked countwords, it would store all of the words and count them up cumulatively so that it would store the individual words from all the strings, erasing nothing.

<h1> What crucial role does the Iterator abstraction play in making WordCounter testable?</h1>
The Iterator allows WordCounter to travel through file so the program can store the data.