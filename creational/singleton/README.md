`Reference` : `https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples`

`Note:` 
`Thread Safe :`
`1.` The best and simple implementation is `Bill Pugh Implementation` which is based on static inner helper class
`2.` `synchronized` for the first time contention, once instance is created, we don't need synchronized

`Breaking with Reflections:`
`1.` Any class based implementation breaks with reflections, except `ENUMS` based implemenation (I did not do it because its just Enum definition)

`Serialization and Deserialization:`
`1.` When you serialize and saved it file. Now De-serialize it from file, the object you get is different one.
`2.` Trick is to add `public Object readSolvable() {return getInstance()}` method to the class.