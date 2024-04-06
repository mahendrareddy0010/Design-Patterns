1. It is useful when we have specific subparts to managed by different algorithms, but overall process has a some template hiding.
2. This prevelant everywhere, we use it unknowngly everywhere.

Example: `Thread class start() method` takes `Runnable obj` with `run method` as argument. 
        Every class which implements functional interface (one method interface) but not implement but take as argument is using Template pattern.

3. This has limitations of modifying or extension which is very difficult to refactor.