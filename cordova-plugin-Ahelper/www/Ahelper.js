function Ahelper() {
};

Ahelper.prototype.exit = function (success, error) {
  cordova.exec(success, error, 'Ahelper', 'Exit', []);
}


Ahelper.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }
  window.plugins.Ahelper = new Ahelper();
  return window.plugins.Ahelper;
};

cordova.addConstructor(Ahelper.install);
