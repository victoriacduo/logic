const express = require('express');
const app = express();

app.use(express.json());

app.get('/projeto',(req, res)=>{
    res.json("alô mundo");
});

app.listen(3000, ()=>{
    console.log("Tudo certo!");
});