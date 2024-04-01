1. Event Handling in React.js while moving up each one does something and propagate it up.
2. It is similar to Chain of Responsibility paper in Distributed system,
    but, there one system in middle may be offline, which leads to unavailability of some services untill they detect failure and reconfigure.
    But, in our case, this won't be a problem, objects don't die unless entire program is dead.

3. Chain of Approvals

4. Middleware in Web frameworks for example, express.js middleware where input error handling takes place.

5. Logging System, where we have simple warnings to a file, serious warnings to a file, critical errors to email.