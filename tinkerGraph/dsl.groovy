def test_t(org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource t) {
	GraphTraversal<Vertex, Vertex> traversal = new org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.DefaultGraphTraversal<>(t);
	println Arrays.toString(traversal.getSteps().toArray());
	traversal.asAdmin().addStep(new org.apache.tinkerpop.gremlin.process.traversal.step.map.GraphStep<>(traversal.asAdmin(), Vertex.class, true));
	 println Arrays.toString(traversal.getSteps().toArray());
	 return Arrays.toString(traversal.getSteps().toArray());
 }

:remote connect tinkerpop.server conf/remote.yaml session
:remote console
t_graph = TinkerGraph.open()
t = t_graph.traversal()


v1 =t.addV('person').property(id, 57).property('name', 'Anil').next()
v2 =t.addV('software').property('name', 'ai').next()
t.addE('created').from(v1).to(v2).property('weight', 1.0)
==>e[5][57-created->3]


v11 =t.addV('person').property(id, 58).property('name', 'Anvik').next()
v2 =t.addV('software').property('name', 'ml').next()
t.addE('created').from(v11).to(v2).property('weight', 1.0)
==>e[7][58-created->5]

v2 =t.addV('software').property('name', 'ai-ml').next()
t.addE('created').from(__.V(57)).to(v2).property('weight', 0.7)
t.addE('created').from(__.V(58)).to(v2).property('weight', 0.3)

t.V(57).property('age', 100)
t.V(58).property('age', 120)



t.V().has('name', 'Anil').outE('created').inV().elementMap()
==>{id=3, label=software}
gremlin> t.V().has('name', 'Anil').outE('created').inV().values('name')

it =t.V().has('name', within('Anil', 'Anvik')).values('age')

it =t.V().has('name', within('Anil', 'Anvik')).values('age').mean()
v2 =t.addV('software').property('name', 'ai-ml').next()


 t.V(57).out('created').inE('created').outV().elementMap()
==>{id=57, label=person, name=Anil, age=100}
==>{id=57, label=person, name=Anil, age=100}
==>{id=58, label=person, name=Anvik, age=120}