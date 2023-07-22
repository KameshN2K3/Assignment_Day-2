function findMax(numbers) {
  if (!Array.isArray(numbers) || numbers.length === 0) {
    throw new Error("Input must be a non-empty array.");
  }

  return Math.max(...numbers);
}

const numbersArray = [4, 12, 7, 23, 9, 18];
const maxNumber = findMax(numbersArray);
console.log("The maximum number is:", maxNumber);
