const assentos = document.querySelectorAll('.assento');

assentos.forEach(function(assento)  {

  assento.addEventListener('click', () => {

    if (assento.classList.contains('ocupado')) {
      return;
    }

    assento.classList.toggle('selecionado');

  });

});