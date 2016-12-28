const failMessage = "Calculation failed! Try Again!"
const numberFormatMessage = "You entered invalid number! Try Again!"
const unsupportedOperationMessage = "Your operation isn't supported by this version of calculator! Try Again!"

const controlButton = document.querySelector(".reset")


const reset = () => controlButton.innerHTML = "Activate calculator"

const showResult = (result) => {
  alert("Result equals: " + result)
}

const tryResult = (result) => {
  switch (result) {
    case NaN:
      alert(numberFormatExsceptionMessage)
      reset()
      break;
    default:
      showResult(result)
      reset()
  }
}

const runCalculator = () => {

  controlButton.innerHTML = "Calculator is running"

  var firstOperand = prompt("Please enter first operand:")
  var operation = prompt("Please enter operation:")
  var secondOperand = prompt("Please enter second operand:")

  if (firstOperand == "" || operation == "" || secondOperand == "") {
  alert(failMessage)
} else {
  let result
  switch (operation) {
    case "+":
      result = Number(firstOperand) + Number(secondOperand)
      tryResult(result)
      break;
    case "-":
      result = Number(firstOperand) - Number(secondOperand)
      tryResult(result)
      break;
    case "*":
      result = Number(firstOperand) * Number(secondOperand)
      tryResult(result)
      break;
    case "/":
      result = Number(firstOperand) / Number(secondOperand)
      tryResult(result)
      break;
    default:
      alert(unsupportedOperationMessage)
      reset()
  }
}}

const run = () => {
  runCalculator()
}

controlButton.onclick = () => run()
