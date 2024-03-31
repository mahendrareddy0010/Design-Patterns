`Ideas:`
1. Subjects/Publishers ------   Observers
2. subjects has some state info, when it gets changed we need to tell all observers who registered for this Subject object.
3. Please note, all observers objects are linked to subject object, not subject class.
4. currerent implementation is `push based model (RabbitMQ`), not pull based model(Kafka)

`Extensions: notification system`
1. not -persistent 
2. not distributed, neither sharded nor replicated

`Implementation Idea:`
our state contain, `processed msgs`, `in-progress msgs`.
1. Aynchronously/new virtual thread, when any new msg comes, add it into `in-progress msgs set`, each msg has list observers which got processed when done with all observers move to `processed msgs set`.
2. We can do synchronously also, then we don't need `processed msgs set`. just process one msg at a time.