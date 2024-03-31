We can only change the inteface methods only, we don't add new methods.

1. GUIs, where we can add new feature on top of another.
2. Data streams, we can formmating, encryption, compression, buffering....
3. Web design, most of the react components, where we put new html composing the component. It leads to DOM tree where Composite patterns helps.
    `Example:`
        <div>
            <div> 
                some decorated html on top  
            </div>
            <div>        
                `{givent react component}`
            </div>
            <div>
                some decorated html bottom
            </div>
        <div>

4. Python closures are decorators
5. Game Development where we can add new features or change the content based on the state of the game.
    This is useful for handling appearance (UI) just like web design use case.
    But logic can be handled by `State Pattern`.
    