public class Turma_Al {
    public Turma_Al (String descricao, Map<Aluno> al){
        this.descricao = descricao;
        //this.aluno = mapa:
        this.alunos = this.alunos.values().stream().collect(Collectors.toMap(a->a.getNome(), a->a.clone()));
        //this.aluno = lista:
        this.alunos = this.alunos.stream().map(a->a.clone()).collect(Collectors.toList());
    }

    public Map<String,Aluno> getAlunos(){
        Map<String,Aluno> aux = new HashMap<>();
        for(String chave: this.alunos.keySet()){
            aux.put(chave, this.alunos.get(chave).clone());
        }
        return aux;
        //return this.alunos.stream().map(Aluno::clone).collect(Collectors.toList());
    }
    public void setAlunos(Map<String,Aluno> al){
        this.alunos = this.alunos.values().stream().collect(Collectors.toMap(a->a.getNome(), a->a.clone()));
    }

    public void addAluno(Aluno a){
        this.alunos.put(a.getNome(), a.clone());
    }

    public Aluno getAluno(String codAluno){
        if(this.alunos.containsKey(nomeAluno)) return this.alunos.get(nomeAluno);
        return null;
    }

    public void removeAluno(String nomeAluno){
        this.alunos.remove(nomeAluno);
    }

    public Set<String> todosOsCodigos(){
        return new TreeSet<>(this.alunos.KeySet());
    }

    public Set<Aluno> alunosOrdemAlfabetica(){
        Set<Aluno> t = new TreeSet<>();
        for(Aluno a:this.alunos.values()){
            t.add(a.clone());
        }
        return t;
    }

    public Set<Aluno> alunosOrdenaAlfabeticaStreams(){
        return this.alunos.values().stream().map(Aluno::clone).collect(Collectors.toCollection(TreeSet::new));
    }
}