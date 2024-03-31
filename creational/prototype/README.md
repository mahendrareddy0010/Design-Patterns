This is shallow copying, that is why it fails for List variable

`Other Ideas :`

1. `copy constructor` where we provide all fields with `deep copy/shallow copy`
2. `deep copy` ------ serialize and then deserialize
3. `deep copy` ------ serailization works only when all object in the graph implements serialization,
    when we use third party libraries which did not implement serialization, then it fails
4. `deep copy` ------ `Gson` library it does not require serialization implementation
    I think, only it is possible is through Reflections APIs, otherwise how you get acceess to the private variables.
    Even serialization and de-serialization also implemented through Reflections APIs, of course some extra work of class loading, stream handling.